package MedicalStore;

/**
* MedicalStore/MedicineInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from store.idl
* Saturday, 14 April, 2018 10:58:32 AM IST
*/

public final class MedicineInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public MedicalStore.MedicineInfo value = null;

  public MedicineInfoHolder ()
  {
  }

  public MedicineInfoHolder (MedicalStore.MedicineInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MedicalStore.MedicineInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MedicalStore.MedicineInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MedicalStore.MedicineInfoHelper.type ();
  }

}
