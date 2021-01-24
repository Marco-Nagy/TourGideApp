package com.example.tourgideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {
    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PlacesFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new RestaurantsFragment();
            default:
                return new ShoppingFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
