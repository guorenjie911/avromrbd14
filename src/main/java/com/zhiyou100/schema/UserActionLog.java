/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.zhiyou100.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserActionLog extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4242450194142077808L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserActionLog\",\"namespace\":\"com.zhiyou100.schema\",\"fields\":[{\"name\":\"userName\",\"type\":\"string\"},{\"name\":\"actionType\",\"type\":\"string\"},{\"name\":\"ipAddress\",\"type\":\"string\"},{\"name\":\"gender\",\"type\":\"int\"},{\"name\":\"provience\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserActionLog> ENCODER =
      new BinaryMessageEncoder<UserActionLog>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserActionLog> DECODER =
      new BinaryMessageDecoder<UserActionLog>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserActionLog> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserActionLog> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserActionLog>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserActionLog to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserActionLog from a ByteBuffer. */
  public static UserActionLog fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence userName;
  @Deprecated public java.lang.CharSequence actionType;
  @Deprecated public java.lang.CharSequence ipAddress;
  @Deprecated public int gender;
  @Deprecated public java.lang.CharSequence provience;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserActionLog() {}

  /**
   * All-args constructor.
   * @param userName The new value for userName
   * @param actionType The new value for actionType
   * @param ipAddress The new value for ipAddress
   * @param gender The new value for gender
   * @param provience The new value for provience
   */
  public UserActionLog(java.lang.CharSequence userName, java.lang.CharSequence actionType, java.lang.CharSequence ipAddress, java.lang.Integer gender, java.lang.CharSequence provience) {
    this.userName = userName;
    this.actionType = actionType;
    this.ipAddress = ipAddress;
    this.gender = gender;
    this.provience = provience;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userName;
    case 1: return actionType;
    case 2: return ipAddress;
    case 3: return gender;
    case 4: return provience;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userName = (java.lang.CharSequence)value$; break;
    case 1: actionType = (java.lang.CharSequence)value$; break;
    case 2: ipAddress = (java.lang.CharSequence)value$; break;
    case 3: gender = (java.lang.Integer)value$; break;
    case 4: provience = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userName' field.
   * @return The value of the 'userName' field.
   */
  public java.lang.CharSequence getUserName() {
    return userName;
  }

  /**
   * Sets the value of the 'userName' field.
   * @param value the value to set.
   */
  public void setUserName(java.lang.CharSequence value) {
    this.userName = value;
  }

  /**
   * Gets the value of the 'actionType' field.
   * @return The value of the 'actionType' field.
   */
  public java.lang.CharSequence getActionType() {
    return actionType;
  }

  /**
   * Sets the value of the 'actionType' field.
   * @param value the value to set.
   */
  public void setActionType(java.lang.CharSequence value) {
    this.actionType = value;
  }

  /**
   * Gets the value of the 'ipAddress' field.
   * @return The value of the 'ipAddress' field.
   */
  public java.lang.CharSequence getIpAddress() {
    return ipAddress;
  }

  /**
   * Sets the value of the 'ipAddress' field.
   * @param value the value to set.
   */
  public void setIpAddress(java.lang.CharSequence value) {
    this.ipAddress = value;
  }

  /**
   * Gets the value of the 'gender' field.
   * @return The value of the 'gender' field.
   */
  public java.lang.Integer getGender() {
    return gender;
  }

  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(java.lang.Integer value) {
    this.gender = value;
  }

  /**
   * Gets the value of the 'provience' field.
   * @return The value of the 'provience' field.
   */
  public java.lang.CharSequence getProvience() {
    return provience;
  }

  /**
   * Sets the value of the 'provience' field.
   * @param value the value to set.
   */
  public void setProvience(java.lang.CharSequence value) {
    this.provience = value;
  }

  /**
   * Creates a new UserActionLog RecordBuilder.
   * @return A new UserActionLog RecordBuilder
   */
  public static com.zhiyou100.schema.UserActionLog.Builder newBuilder() {
    return new com.zhiyou100.schema.UserActionLog.Builder();
  }

  /**
   * Creates a new UserActionLog RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserActionLog RecordBuilder
   */
  public static com.zhiyou100.schema.UserActionLog.Builder newBuilder(com.zhiyou100.schema.UserActionLog.Builder other) {
    return new com.zhiyou100.schema.UserActionLog.Builder(other);
  }

  /**
   * Creates a new UserActionLog RecordBuilder by copying an existing UserActionLog instance.
   * @param other The existing instance to copy.
   * @return A new UserActionLog RecordBuilder
   */
  public static com.zhiyou100.schema.UserActionLog.Builder newBuilder(com.zhiyou100.schema.UserActionLog other) {
    return new com.zhiyou100.schema.UserActionLog.Builder(other);
  }

  /**
   * RecordBuilder for UserActionLog instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserActionLog>
    implements org.apache.avro.data.RecordBuilder<UserActionLog> {

    private java.lang.CharSequence userName;
    private java.lang.CharSequence actionType;
    private java.lang.CharSequence ipAddress;
    private int gender;
    private java.lang.CharSequence provience;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.zhiyou100.schema.UserActionLog.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userName)) {
        this.userName = data().deepCopy(fields()[0].schema(), other.userName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.actionType)) {
        this.actionType = data().deepCopy(fields()[1].schema(), other.actionType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[2].schema(), other.ipAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gender)) {
        this.gender = data().deepCopy(fields()[3].schema(), other.gender);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.provience)) {
        this.provience = data().deepCopy(fields()[4].schema(), other.provience);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserActionLog instance
     * @param other The existing instance to copy.
     */
    private Builder(com.zhiyou100.schema.UserActionLog other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userName)) {
        this.userName = data().deepCopy(fields()[0].schema(), other.userName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.actionType)) {
        this.actionType = data().deepCopy(fields()[1].schema(), other.actionType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ipAddress)) {
        this.ipAddress = data().deepCopy(fields()[2].schema(), other.ipAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gender)) {
        this.gender = data().deepCopy(fields()[3].schema(), other.gender);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.provience)) {
        this.provience = data().deepCopy(fields()[4].schema(), other.provience);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'userName' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserName() {
      return userName;
    }

    /**
      * Sets the value of the 'userName' field.
      * @param value The value of 'userName'.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder setUserName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userName' field has been set.
      * @return True if the 'userName' field has been set, false otherwise.
      */
    public boolean hasUserName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userName' field.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder clearUserName() {
      userName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'actionType' field.
      * @return The value.
      */
    public java.lang.CharSequence getActionType() {
      return actionType;
    }

    /**
      * Sets the value of the 'actionType' field.
      * @param value The value of 'actionType'.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder setActionType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.actionType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'actionType' field has been set.
      * @return True if the 'actionType' field has been set, false otherwise.
      */
    public boolean hasActionType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'actionType' field.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder clearActionType() {
      actionType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ipAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getIpAddress() {
      return ipAddress;
    }

    /**
      * Sets the value of the 'ipAddress' field.
      * @param value The value of 'ipAddress'.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder setIpAddress(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ipAddress = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ipAddress' field has been set.
      * @return True if the 'ipAddress' field has been set, false otherwise.
      */
    public boolean hasIpAddress() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ipAddress' field.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder clearIpAddress() {
      ipAddress = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'gender' field.
      * @return The value.
      */
    public java.lang.Integer getGender() {
      return gender;
    }

    /**
      * Sets the value of the 'gender' field.
      * @param value The value of 'gender'.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder setGender(int value) {
      validate(fields()[3], value);
      this.gender = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'gender' field has been set.
      * @return True if the 'gender' field has been set, false otherwise.
      */
    public boolean hasGender() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'gender' field.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder clearGender() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'provience' field.
      * @return The value.
      */
    public java.lang.CharSequence getProvience() {
      return provience;
    }

    /**
      * Sets the value of the 'provience' field.
      * @param value The value of 'provience'.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder setProvience(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.provience = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'provience' field has been set.
      * @return True if the 'provience' field has been set, false otherwise.
      */
    public boolean hasProvience() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'provience' field.
      * @return This builder.
      */
    public com.zhiyou100.schema.UserActionLog.Builder clearProvience() {
      provience = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserActionLog build() {
      try {
        UserActionLog record = new UserActionLog();
        record.userName = fieldSetFlags()[0] ? this.userName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.actionType = fieldSetFlags()[1] ? this.actionType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ipAddress = fieldSetFlags()[2] ? this.ipAddress : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.gender = fieldSetFlags()[3] ? this.gender : (java.lang.Integer) defaultValue(fields()[3]);
        record.provience = fieldSetFlags()[4] ? this.provience : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserActionLog>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserActionLog>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserActionLog>
    READER$ = (org.apache.avro.io.DatumReader<UserActionLog>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
