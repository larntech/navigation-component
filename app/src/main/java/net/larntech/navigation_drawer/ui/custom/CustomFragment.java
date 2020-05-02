package net.larntech.navigation_drawer.ui.custom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import net.larntech.navigation_drawer.R;

import org.w3c.dom.Text;

public class CustomFragment  extends Fragment {

    CustomViewModel customViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        customViewModel = ViewModelProviders.of(this).get(CustomViewModel.class);
        View root = inflater.inflate(R.layout.fragment_custom,container,false);

        final TextView myText = root.findViewById(R.id.text_custom);
        customViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                myText.setText(s);
            }
        });

        return root;
    }
}
