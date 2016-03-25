package com.example.testframentactiivty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TestFrament extends Fragment {
	@SuppressWarnings("static-access")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frament_test, container, false);
		
		return view;
	}
	
	@Override
	public void onViewCreated(View view, @Nullable
	Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		buidView();
		super.onViewCreated(view, savedInstanceState);
	}
	
	private void buidView() {
		SecondFrament secondFrament = new SecondFrament();
		FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
		fragmentTransaction.replace(R.id.ll_show, secondFrament);
		fragmentTransaction.commitAllowingStateLoss();
	}
}
