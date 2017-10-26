package io.confluent.connect.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum UserType {
  ANONYMOUS, REGISTERED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"UserType\",\"namespace\":\"io.confluent.connect.avro\",\"symbols\":[\"ANONYMOUS\",\"REGISTERED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
