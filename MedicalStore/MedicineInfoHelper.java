package MedicalStore;


/**
* MedicalStore/MedicineInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from store.idl
* Saturday, 14 April, 2018 10:58:32 AM IST
*/

abstract public class MedicineInfoHelper
{
  private static String  _id = "IDL:MedicalStore/MedicineInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, MedicalStore.MedicineInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MedicalStore.MedicineInfo extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "count",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "price",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (MedicalStore.MedicineInfoHelper.id (), "MedicineInfo", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MedicalStore.MedicineInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    MedicalStore.MedicineInfo value = new MedicalStore.MedicineInfo ();
    value.name = istream.read_string ();
    value.count = istream.read_long ();
    value.price = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MedicalStore.MedicineInfo value)
  {
    ostream.write_string (value.name);
    ostream.write_long (value.count);
    ostream.write_long (value.price);
  }

}
