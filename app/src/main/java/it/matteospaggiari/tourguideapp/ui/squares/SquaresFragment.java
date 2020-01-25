package it.matteospaggiari.tourguideapp.ui.squares;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import it.matteospaggiari.tourguideapp.R;

/**
 * {@link Fragment} that displays a list of Squares.
 */
public class SquaresFragment extends Fragment {

    /* Variable for ViewModel object */
    private SquareViewModel mViewModel;
    /* Variable for RecyclerView object */
    private RecyclerView mRecyclerView;
    /* Variable for LayoutManager of the RecyclerView object */
    private RecyclerView.LayoutManager mLayoutManager;
    /* Variable for SquareRecyclerAdapter object */
    private SquareRecyclerAdapter mAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create a ViewModel the first time the system calls an fragment's onCreateView() method.
        // Re-created activity/fragment receive the same ViewModel instance created by the first activity/fragment.
        mViewModel = ViewModelProviders.of(this).get(SquareViewModel.class);
        // Inflate the layout for this fragment by assigning it to the root variable
        View root = inflater.inflate(R.layout.fragment_cardview, container, false);
        // Get the RecyclerView
        mRecyclerView = root.findViewById(R.id.recycler_view);
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(root.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        // Specify an adapter
        mAdapter = new SquareRecyclerAdapter(mViewModel);
        mRecyclerView.setAdapter(mAdapter);

        return root;
    }
}