package com.nkcdev.infobook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nkcdev.infobook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentUnitedKingdom extends Fragment {

    private ImageView imageViewUnitedKingdom;
    private ProgressBar progressBarUnitedKingdom;

    public static FragmentUnitedKingdom newInstance() {
        return new FragmentUnitedKingdom();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //This is how we define design file we created
        View view = inflater.inflate(R.layout.fragment_united_kingdom, container, false);

        imageViewUnitedKingdom = view.findViewById(R.id.imageViewUnitedKingdom);
        progressBarUnitedKingdom = view.findViewById(R.id.progressBarUnitedKingdom);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/" +
                "Flag_of_the_United_Kingdom_%281-2%29.svg/1920px-Flag_of_the_United_Kingdom_%281-2%29.svg.png")
                .into(imageViewUnitedKingdom, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarUnitedKingdom.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                        progressBarUnitedKingdom.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
