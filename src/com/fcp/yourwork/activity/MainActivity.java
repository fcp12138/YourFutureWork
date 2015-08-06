package com.fcp.yourwork.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.fcp.yourfuturework.R;
import com.fcp.yourwork.fragment.EightFragment;
import com.fcp.yourwork.fragment.FiveFragment;
import com.fcp.yourwork.fragment.FourFragment;
import com.fcp.yourwork.fragment.NineFragment;
import com.fcp.yourwork.fragment.OneFragment;
import com.fcp.yourwork.fragment.ResultFragment;
import com.fcp.yourwork.fragment.SevenFragment;
import com.fcp.yourwork.fragment.SixFragment;
import com.fcp.yourwork.fragment.TenFragment;
import com.fcp.yourwork.fragment.ThreeFragment;
import com.fcp.yourwork.fragment.TwoFragment;
import com.fcp.yourwork.view.MyViewPager;

public class MainActivity extends ActionBarActivity {

	// ViewPager类
	private static MyViewPager mViewPager;
	// 装Fragment的list
	private static ArrayList<Fragment> pageList = new ArrayList<Fragment>();
	// 导航栏的标题
	private TextView titleTv;
	
	private String[] strings=new String[]{"第一页","第二页","第三页","第四页","第五页","第六页","第七页","第八页","第九页","第十页","结果"};
	//总分
	public static int number=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initActionBar();
		initView();
	}

	private void initView() {
		// 添加界面
		pageList.add(new OneFragment());
		pageList.add(new TwoFragment());
		pageList.add(new ThreeFragment());
		pageList.add(new FourFragment());
		pageList.add(new FiveFragment());
		pageList.add(new SixFragment());
		pageList.add(new SevenFragment());
		pageList.add(new EightFragment());
		pageList.add(new NineFragment());
		pageList.add(new TenFragment());
		pageList.add(new ResultFragment());
		// ViewPager处理
		mViewPager = (MyViewPager) findViewById(R.id.content);
		mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
		mViewPager.setNoScroll(true);
		pagerChanged(0);
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageSelected(int arg0) {
				pagerChanged(arg0);
			}


			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	/**
	 * 初始化actionbar
	 */
	private void initActionBar() {
		ActionBar mActionBar = getSupportActionBar();
		mActionBar.setCustomView(R.layout.actionbar);
		mActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		// 使自定义的View显示
		mActionBar.setDisplayShowCustomEnabled(true);
		titleTv = (TextView) mActionBar.getCustomView().findViewById(R.id.ActionBarTitle_tv);
	}

	
	/**
	 * 页面跳转时的动作
	 * @param arg0
	 */
	private void pagerChanged(int i) {
		titleTv.setText(strings[i]);
		
	}
	
	public static class MyAdapter extends FragmentPagerAdapter {
		public MyAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getCount() {
			return 11;
		}

		@Override
		public Fragment getItem(int position) {
			return pageList.get(position);
		}

	}
	/**
	 * 设置界面
	 * @param i
	 */
	public static void setpage(int i){
		mViewPager.setCurrentItem(i);
	}

}
