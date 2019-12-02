package bpc.dis.recyclerutilities.BottomSpaceItemDecoration;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BottomSpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int bottomSpace;

    public BottomSpaceItemDecoration(int bottomSpace) {
        this.bottomSpace = bottomSpace;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) == state.getItemCount() - 1) {
            outRect.bottom = bottomSpace;
        }
    }

}