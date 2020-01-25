package it.matteospaggiari.tourguideapp.ui.theaters;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import it.matteospaggiari.tourguideapp.R;

/**
 * {@link TheaterRecyclerAdapter} represent the RecyclerAdapter of a Church
 *
 **/
public class TheaterRecyclerAdapter extends RecyclerView.Adapter<TheaterRecyclerAdapter.ViewHolder> {

    /* Variable for ViewModel object */
    private TheaterViewModel mViewModel;

    public TheaterRecyclerAdapter(TheaterViewModel viewModel) {
        this.mViewModel = viewModel;
    }

    /* Create new views (invoked by the layout manager) */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    /* Replace the contents of a view (invoked by the layout manager) */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.mImage.setImageResource(mViewModel.getTheater(position).getImageResourceId());
        viewHolder.mName.setText(mViewModel.getTheater(position).getName());
    }

    /* Return the size of your dataset (invoked by the layout manager) */
    @Override
    public int getItemCount() {
        return mViewModel.numberTheaters();
    }

    /* Provide a reference to the views for each data item */
    class ViewHolder extends RecyclerView.ViewHolder {

        /* Declare Variables view of each data item */
        ImageView mPhone;
        ImageView mWebsite;
        ImageView mPosition;
        ImageView mImage;
        TextView mName;

        ViewHolder(View itemView) {
            super(itemView);
            /* Retrieve the views of each data item */
            mPhone = itemView.findViewById(R.id.ic_phone);
            mWebsite = itemView.findViewById(R.id.ic_website);
            mPosition = itemView.findViewById(R.id.ic_position);
            mImage = itemView.findViewById(R.id.item_image);
            mName = itemView.findViewById(R.id.item_title);

            /* Imposed a listener click event on the phone icon to send an intent */
            mPhone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(mViewModel.getTheater(position).getPhone()));
                    v.getContext().startActivity(intent);

                }
            });

            /* Imposed a listener click event on the website icon to send an intent */
            mWebsite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(mViewModel.getTheater(position).getWebsite()));
                    v.getContext().startActivity(intent);
                }
            });

            /* Imposed a listener click event on the position icon to send an intent */
            mPosition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(mViewModel.getTheater(position).getPosition()));
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
