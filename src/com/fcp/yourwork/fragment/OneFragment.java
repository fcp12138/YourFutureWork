package com.fcp.yourwork.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fcp.yourfuturework.R;
import com.fcp.yourwork.activity.MainActivity;

public class OneFragment extends Fragment implements OnClickListener{
	
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		return inflater.inflate(R.layout.one, container, false);
	}
	
	private TextView textView1;
	private TextView textView2;
	private TextView textView3;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initView();
	}

	private void initView() {
		textView1=(TextView)getActivity().findViewById(R.id.oneA);
		textView2=(TextView)getActivity().findViewById(R.id.oneB);
		textView3=(TextView)getActivity().findViewById(R.id.oneC);
		textView1.setOnClickListener(this);
		textView2.setOnClickListener(this);
		textView3.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		MainActivity.setpage(1);
		if(v.getId()==textView1.getId()){
			MainActivity.number+=2;
		}else if(v.getId()==textView2.getId()){
			MainActivity.number+=2;
		}else if(v.getId()==textView3.getId()){
			MainActivity.number+=1;
		}
		
	}
	
	
}
