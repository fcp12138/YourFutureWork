package com.fcp.yourwork.fragment;

import com.fcp.yourfuturework.R;
import com.fcp.yourwork.activity.MainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourFragment extends Fragment implements OnClickListener{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		return inflater.inflate(R.layout.four, container, false);
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
		textView1=(TextView)getActivity().findViewById(R.id.fourA);
		textView2=(TextView)getActivity().findViewById(R.id.fourB);
		textView3=(TextView)getActivity().findViewById(R.id.fourC);
		textView1.setOnClickListener(this);
		textView2.setOnClickListener(this);
		textView3.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		MainActivity.setpage(4);
		if(v.getId()==textView1.getId()){
			MainActivity.number+=3;
		}else if(v.getId()==textView2.getId()){
			MainActivity.number+=1;
		}else if(v.getId()==textView3.getId()){
			MainActivity.number+=2;
		}
		
	}
}
