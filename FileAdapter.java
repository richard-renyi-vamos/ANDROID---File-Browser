import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.ViewHolder> {
    private List<String> fileNames;

    public FileAdapter(List<String> fileNames) {
        this.fileNames = fileNames;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.file_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.fileNameTextView.setText(fileNames.get(position));
    }

    @Override
    public int getItemCount() {
        return fileNames.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView fileNameTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            fileNameTextView = itemView.findViewById(R.id.fileNameTextView);
        }
    }
}
