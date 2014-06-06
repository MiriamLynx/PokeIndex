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

import domain.Objeto;
import domain.Pokemon;

/**
 * Created by Lynx on 6/06/14.
 */
public class ObjAdapter extends ArrayAdapter{

    private Context context;
    private ArrayList<Objeto> data;

    public ObjAdapter(Context context, ArrayList<Objeto> data) {
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
        String icon = data.get(position).getImagen();
        imagen.setImageResource(context.getResources().getIdentifier("drawable/" + icon, null, context.getPackageName()));

        // Recogemos el TextView para mostrar el nombre y establecemos el
        // nombre.
        TextView name = (TextView) item.findViewById(R.id.pktext);
        name.setText(data.get(position).getNombre());

        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }
}
