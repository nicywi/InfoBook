package com.nkcdev.infobook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.nkcdev.infobook.fragments.FragmentFrance;
import com.nkcdev.infobook.fragments.FragmentItaly;
import com.nkcdev.infobook.fragments.FragmentTajMahal;
import com.nkcdev.infobook.fragments.FragmentUnitedKingdom;

public class ViewPagerAdapterWonders extends FragmentStateAdapter {

    public ViewPagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position) {
            case 0:
                fragment = FragmentTajMahal.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
