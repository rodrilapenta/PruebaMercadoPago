package ar.com.afrapps.pruebamercadopago;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mercadopago.android.px.core.MercadoPagoCheckout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MercadoPagoCheckout.Builder("TEST-7e697b4b-42da-453c-952e-bdbfceac1c4e", "150216849-ceed1ee4-8ab9-4449-869f-f4a8565d386f")
                .build()
                .startPayment(this, 1);
    }
}
