package com.puc.ihc.capital.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.puc.ihc.capital.R;
import com.puc.ihc.capital.interfaces.OnFragmentInteraction;

public class TransferenciasFragment extends Fragment {

    private OnFragmentInteraction mListener;

    public TransferenciasFragment() {
    }

    public static TransferenciasFragment newInstance() {
        return new TransferenciasFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_transferencias, container, false);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //((PrincipalActivity) activity).onSectionAttached(getArguments().getString("Titulo"));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}