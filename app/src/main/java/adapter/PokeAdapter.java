package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.R;

import java.util.ArrayList;

import domain.Pokemon;

/**
 * Created by Lynx on 4/06/14.
 */
public class PokeAdapter extends ArrayAdapter{

    private Context context;
    private ArrayList<Pokemon> data;

    public PokeAdapter(Context context, ArrayList<Pokemon> data) {
        super(context, R.layout.list_view_item, data);
        // Guardamos los parámetros en variables de clase.
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // En primer lugar "inflamos" una nueva vista, que será la que se
        // mostrará en la celda del ListView. Para ello primero creamos el
        // inflater, y después inflamos la vista.
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.list_view_item, null);

        // A partir de la vista, recogeremos los controles que contiene para
        // poder manipularlos.
        // Recogemos el ImageView y le asignamos una foto.
        ImageView imagen = (ImageView) item.findViewById(R.id.pkicon);
        imagen.setImageResource(R.drawable.ic_launcher);

        // Recogemos el TextView para mostrar el nombre y establecemos el
        // nombre.
        TextView name = (TextView) item.findViewById(R.id.pktext);
        name.setText(data.get(position).getNumber() + " " + data.get(position).getName());

        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }
}
