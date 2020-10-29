package com.example.connectframework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.connectframework.databinding.FragmentDetailBinding;
import com.example.connectframework.databinding.FragmentMainBinding;
import com.example.viewmodel.MainViewModel;
import com.example.viewmodel.NavgateTo;
import com.example.viewmodel.PhotoDetailViewModel;


public class mainFragment extends BaseFragment implements NavgateTo {

    private FragmentMainBinding fragmentMainBinding;
    private MainViewModel mainViewModel;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        startDataBinding();
    }

    private void startDataBinding() {
        fragmentMainBinding = DataBindingUtil.setContentView(getActivity(), R.layout.fragment_main);
        mainViewModel = new MainViewModel();
        mainViewModel.setNavgateTo(this);
        fragmentMainBinding.setMainViewModel(mainViewModel);
    }

    @Override
    public void naviTo(Bundle bundle) {
        nav().navigate(R.id.action_mainFragment_to_photoFragment);
    }
}