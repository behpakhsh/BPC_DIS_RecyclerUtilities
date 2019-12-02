package bpc.dis.recyclerutilities.TopSpaceItemDecoration;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopSpaceItemDecoration extends RecyclerView.ItemDecoration {
    
    private int topSpace;

    public TopSpaceItemDecoration(int topSpace) {
        this.topSpace = topSpace;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = topSpace;
        }
    }

}