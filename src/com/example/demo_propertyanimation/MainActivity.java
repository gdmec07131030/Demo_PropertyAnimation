package com.example.demo_propertyanimation;



import android.os.Bundle;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv;
    Button bt1,bt2,bt3,bt4,bt5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		bt1=(Button) findViewById(R.id.button1);
		bt2=(Button) findViewById(R.id.button2);
		bt3=(Button) findViewById(R.id.button3);
		bt4=(Button) findViewById(R.id.button4);
		bt5=(Button) findViewById(R.id.button5);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.alpha_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.translate_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.scale_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		bt4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.rotate_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		bt5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AnimatorSet set=new AnimatorSet();
				Animator alpha=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.alpha_animator);
				Animator translate=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.translate_animator);
				Animator scale=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.scale_animator);
				Animator rotate=AnimatorInflater.loadAnimator
						(MainActivity.this, R.animator.rotate_animator);
				set.play(alpha).after(translate).with(scale).before(rotate);
				set.setTarget(tv);
				set.start();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
