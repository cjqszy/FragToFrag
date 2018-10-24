package com.example.cln62.fragtofrag;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {


    Button bt;

    MyInterface myInterface;

    EditText editText;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myInterface = (MyInterface) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);


        editText = view.findViewById(R.id.editTextInput);
        bt = view.findViewById(R.id.buttonInput);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myInterface.myMethod(editText.getText().toString());
            }
        });
        return view;
    }
}
