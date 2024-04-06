package com.example.mya;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.navigation.Navigation;

public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenta, container, false);

        Button goFragmentb = view.findViewById(R.id.go_fragmentB);
        goFragmentb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exampleData = "Привет";
                Bundle bundle = new Bundle();
                bundle.putString("example", exampleData);
                Navigation.findNavController(view).navigate(R.id.action_FragmentA_FragmentB, bundle);
            }
        });

        return view;
    }
}