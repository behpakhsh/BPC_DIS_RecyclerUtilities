package bpc.dis.recyclerutilities.FirstLastItemSpaceDecoration;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FirstLastItemSpaceDecoration extends RecyclerView.ItemDecoration {

    private final int directSpace;
    private final int reverseSpace;

    public FirstLastItemSpaceDecoration(int space, boolean layoutReversed) {
        if (layoutReversed) {
            directSpace = 0;
            reverseSpace = space;
        } else {
            directSpace = space;
            reverseSpace = 0;
        }
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) == state.getItemCount() - 1) {
            outRect.bottom = directSpace;
            outRect.top = reverseSpace;
        }
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.bottom = reverseSpace;
            outRect.top = directSpace;
        }
    }

}