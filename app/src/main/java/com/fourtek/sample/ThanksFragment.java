package com.fourtek.sample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThanksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThanksFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private UserClass userClass ;
    private Context context;

    public ThanksFragment() {
        // Required empty public constructor
    }

    public ThanksFragment(UserClass userClass) {
        // Required empty public constructor
        this.userClass = userClass;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThanksFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThanksFragment newInstance(String param1, String param2) {
        ThanksFragment fragment = new ThanksFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_thanks, container, false);

        TextView tvText2 = (TextView) view.findViewById(R.id.tvText2);
        TextView tvText = (TextView) view.findViewById(R.id.tvText);

        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataResult dataResult = new DataResult();
                dataResult.setAge("12");
                dataResult.setName("abc");
                dataResult.setRoll_no("13");
                userClass.onSuccess(context, dataResult);
                //finish();
            }
        });

        tvText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userClass.onFailure(context, "failure");
                //finish();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
