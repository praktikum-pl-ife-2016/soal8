/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public abstract class kendaraanUdara implements kendaraan {
    public String nama="",noProd="",manufaktur="",Warna="";
    
    @Override
    public abstract String setManufaktur(String la);

    @Override
    public abstract String setNama(String la);

    @Override
    public abstract String setNoprod(String la);

    @Override
    public abstract String setWarna(String la);
    @Override
    public String caraBeroperasi() {
    return "Cara beroperasi terbang di udara\nMenggunakan bahan bakar aftur";
    }

    
}
