package io.confluent.connect.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TestModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord  {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestModel\",\"namespace\":\"io.confluent.connect.avro\",\"fields\":[{\"name\":\"userType\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"UserType\",\"symbols\":[\"ANONYMOUS\",\"REGISTERED\"]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  private io.confluent.connect.avro.UserType userType;

  /**
   * Default constructor.
   */
  private TestModel() {}

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0: return userType;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0: userType = (io.confluent.connect.avro.UserType)value$; break;
      default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }


  /**
   * Gets the value of the 'userType' field.
   */
  public io.confluent.connect.avro.UserType getUserType() {
    return userType;
  }


  /** Creates a new TestModel RecordBuilder */
  public static TestModel.Builder newBuilder() {
    return new TestModel.Builder();
  }

  /** Creates a new TestModel RecordBuilder by copying an existing Builder */
  public static TestModel.Builder newBuilder(TestModel.Builder other) {
    return new TestModel.Builder(other);
  }

  /** Creates a new TestModel RecordBuilder by copying an existing TestModel instance */
  public static TestModel.Builder newBuilder(TestModel other) {
    return new TestModel.Builder(other);
  }

  /**
   * RecordBuilder for TestModel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestModel>
      implements org.apache.avro.data.RecordBuilder<TestModel> {

    private io.confluent.connect.avro.UserType userType;

    /** Creates a new Builder */
    private Builder() {
      super(TestModel.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(TestModel.Builder other) {
      super(other);
    }

    /** Creates a Builder by copying an existing TestModel instance */
    private Builder(TestModel other) {
      super(TestModel.SCHEMA$);
      if (isValidValue(fields()[0], other.userType)) {
        this.userType = data().deepCopy(fields()[0].schema(), other.userType);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'userType' field */
    public io.confluent.connect.avro.UserType getUserType() {
      return userType;
    }


    /** Sets the value of the 'userType' field */
    public TestModel.Builder setUserType(io.confluent.connect.avro.UserType value) {
      validate(fields()[0], value);
      this.userType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'userType' field has been set */
    public boolean hasUserType() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'userType' field */
    public TestModel.Builder clearUserType() {
      userType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public TestModel build() {
      try {
        TestModel record = new TestModel();
        record.userType = fieldSetFlags()[0] ? this.userType : (io.confluent.connect.avro.UserType) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
