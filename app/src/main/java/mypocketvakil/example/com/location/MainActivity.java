package mypocketvakil.example.com.location;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends AppCompatActivity  {

    GoogleApiClient googleApiClient = null;
    TextView mLatitudeText;
    TextView mLongitudeText;
    GPSTraker gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLatitudeText = (TextView) findViewById(R.id.latitudeText);
        mLongitudeText = (TextView) findViewById(R.id.longitudeText);
        gps=new GPSTraker(this);
        String latitude=Double.toString(gps.getLatitude());
        String longitude=Double.toString(gps.getLongitude());
        mLatitudeText.setText(latitude);
        mLongitudeText.setText(longitude);
//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?daddr=" + latitude + "," + longitude));
//        startActivity(intent);


//        if (googleApiClient == null) {
//            googleApiClient = new GoogleApiClient.Builder(MainActivity.this)
//                    .addApi(LocationServices.API)
//                    .addConnectionCallbacks(this)
//                    .addOnConnectionFailedListener(this).build();
//            googleApiClient.connect();
//
//            LocationRequest locationRequest = LocationRequest.create();
//            locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//            locationRequest.setInterval(30 * 1000);
//            locationRequest.setFastestInterval(5 * 1000);
//            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
//                    .addLocationRequest(locationRequest);
//
//            **************************
//            builder.setAlwaysShow(true); //this is the key ingredient
//            **************************
//
//            PendingResult<LocationSettingsResult> result =
//                    LocationServices.SettingsApi.checkLocationSettings(googleApiClient, builder.build());
//            result.setResultCallback(new ResultCallback<LocationSettingsResult>() {
//                @Override
//                public void onResult(LocationSettingsResult result) {
//                    final Status status = result.getStatus();
//                    final LocationSettingsStates state = result.getLocationSettingsStates();
//                    switch (status.getStatusCode()) {
//                        case LocationSettingsStatusCodes.SUCCESS:
//                             All location settings are satisfied. The client can initialize location
//                             requests here.
//                            break;
//                        case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:
//                             Location settings are not satisfied. But could be fixed by showing the user
//                             a dialog.
//                            try {
//                                 Show the dialog by calling startResolutionForResult(),
//                                 and check the result in onActivityResult().
//                                status.startResolutionForResult(
//                                       MainActivity.this , 1000);
//                            } catch (IntentSender.SendIntentException e) {
//                                 Ignore the error.
//                            }
//                            break;
//                        case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
//                             Location settings are not satisfied. However, we have no way to fix the
//                             settings so we won't show the dialog.
//                            break;
//                    }
//                }
//            });             }
//
//
    }










}
