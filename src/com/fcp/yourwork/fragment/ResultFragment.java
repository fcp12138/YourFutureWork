package com.fcp.yourwork.fragment;

import com.fcp.yourfuturework.R;
import com.fcp.yourwork.activity.MainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ResultFragment extends Fragment {
	
	private TextView mTextView;
	private Button mButton;
	private ViewGroup viewGroup;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		return inflater.inflate(R.layout.result, container, false);
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mTextView=(TextView)getActivity().findViewById(R.id.result_text);
		mButton=(Button)getActivity().findViewById(R.id.again_btn);
		mButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				MainActivity.setpage(0);
				MainActivity.number=0;
				
			}
		});
		viewGroup=(ViewGroup)getActivity().findViewById(R.id.result_layout);
	}
	
	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		super.setUserVisibleHint(isVisibleToUser);
		if(isVisibleToUser){
			int p=MainActivity.number;System.out.println(MainActivity.number);
			MainActivity.number=0;
			if(p>=24&&p<=30){
				mTextView.setText(R.string.result_A);
				viewGroup.setBackgroundResource(R.drawable.resulta);
			}else if(p>=21&&p<=23){
				mTextView.setText(R.string.result_B);
				viewGroup.setBackgroundResource(R.drawable.resultb);
			}else if(p>=17&&p<=20){
				mTextView.setText(R.string.result_C);
				viewGroup.setBackgroundResource(R.drawable.resultc);
			}else if(p>=10&&p<=16){
				mTextView.setText(R.string.result_D);
				viewGroup.setBackgroundResource(R.drawable.resultd);
			}
			
		}
	}
	
}
