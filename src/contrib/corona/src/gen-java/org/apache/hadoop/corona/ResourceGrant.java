/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.corona;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceGrant implements org.apache.thrift.TBase<ResourceGrant, ResourceGrant._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResourceGrant");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NODE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField GRANTED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("grantedTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField APP_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("appInfo", org.apache.thrift.protocol.TType.STRING, (short)6);

  public int id; // required
  public String nodeName; // required
  public InetAddress address; // required
  public long grantedTime; // required
  public String type; // required
  public String appInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NODE_NAME((short)2, "nodeName"),
    ADDRESS((short)3, "address"),
    GRANTED_TIME((short)4, "grantedTime"),
    TYPE((short)5, "type"),
    APP_INFO((short)6, "appInfo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NODE_NAME
          return NODE_NAME;
        case 3: // ADDRESS
          return ADDRESS;
        case 4: // GRANTED_TIME
          return GRANTED_TIME;
        case 5: // TYPE
          return TYPE;
        case 6: // APP_INFO
          return APP_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __GRANTEDTIME_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "ResourceRequestId")));
    tmpMap.put(_Fields.NODE_NAME, new org.apache.thrift.meta_data.FieldMetaData("nodeName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InetAddress.class)));
    tmpMap.put(_Fields.GRANTED_TIME, new org.apache.thrift.meta_data.FieldMetaData("grantedTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_INFO, new org.apache.thrift.meta_data.FieldMetaData("appInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResourceGrant.class, metaDataMap);
  }

  public ResourceGrant() {
  }

  public ResourceGrant(
    int id,
    String nodeName,
    InetAddress address,
    long grantedTime,
    String type)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.nodeName = nodeName;
    this.address = address;
    this.grantedTime = grantedTime;
    setGrantedTimeIsSet(true);
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResourceGrant(ResourceGrant other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    if (other.isSetNodeName()) {
      this.nodeName = other.nodeName;
    }
    if (other.isSetAddress()) {
      this.address = new InetAddress(other.address);
    }
    this.grantedTime = other.grantedTime;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetAppInfo()) {
      this.appInfo = other.appInfo;
    }
  }

  public ResourceGrant deepCopy() {
    return new ResourceGrant(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.nodeName = null;
    this.address = null;
    setGrantedTimeIsSet(false);
    this.grantedTime = 0;
    this.type = null;
    this.appInfo = null;
  }

  public int getId() {
    return this.id;
  }

  public ResourceGrant setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public String getNodeName() {
    return this.nodeName;
  }

  public ResourceGrant setNodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  public void unsetNodeName() {
    this.nodeName = null;
  }

  /** Returns true if field nodeName is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeName() {
    return this.nodeName != null;
  }

  public void setNodeNameIsSet(boolean value) {
    if (!value) {
      this.nodeName = null;
    }
  }

  public InetAddress getAddress() {
    return this.address;
  }

  public ResourceGrant setAddress(InetAddress address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public long getGrantedTime() {
    return this.grantedTime;
  }

  public ResourceGrant setGrantedTime(long grantedTime) {
    this.grantedTime = grantedTime;
    setGrantedTimeIsSet(true);
    return this;
  }

  public void unsetGrantedTime() {
    __isset_bit_vector.clear(__GRANTEDTIME_ISSET_ID);
  }

  /** Returns true if field grantedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantedTime() {
    return __isset_bit_vector.get(__GRANTEDTIME_ISSET_ID);
  }

  public void setGrantedTimeIsSet(boolean value) {
    __isset_bit_vector.set(__GRANTEDTIME_ISSET_ID, value);
  }

  public String getType() {
    return this.type;
  }

  public ResourceGrant setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getAppInfo() {
    return this.appInfo;
  }

  public ResourceGrant setAppInfo(String appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  public void unsetAppInfo() {
    this.appInfo = null;
  }

  /** Returns true if field appInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetAppInfo() {
    return this.appInfo != null;
  }

  public void setAppInfoIsSet(boolean value) {
    if (!value) {
      this.appInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case NODE_NAME:
      if (value == null) {
        unsetNodeName();
      } else {
        setNodeName((String)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((InetAddress)value);
      }
      break;

    case GRANTED_TIME:
      if (value == null) {
        unsetGrantedTime();
      } else {
        setGrantedTime((Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case APP_INFO:
      if (value == null) {
        unsetAppInfo();
      } else {
        setAppInfo((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case NODE_NAME:
      return getNodeName();

    case ADDRESS:
      return getAddress();

    case GRANTED_TIME:
      return Long.valueOf(getGrantedTime());

    case TYPE:
      return getType();

    case APP_INFO:
      return getAppInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NODE_NAME:
      return isSetNodeName();
    case ADDRESS:
      return isSetAddress();
    case GRANTED_TIME:
      return isSetGrantedTime();
    case TYPE:
      return isSetType();
    case APP_INFO:
      return isSetAppInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResourceGrant)
      return this.equals((ResourceGrant)that);
    return false;
  }

  public boolean equals(ResourceGrant that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_nodeName = true && this.isSetNodeName();
    boolean that_present_nodeName = true && that.isSetNodeName();
    if (this_present_nodeName || that_present_nodeName) {
      if (!(this_present_nodeName && that_present_nodeName))
        return false;
      if (!this.nodeName.equals(that.nodeName))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_grantedTime = true;
    boolean that_present_grantedTime = true;
    if (this_present_grantedTime || that_present_grantedTime) {
      if (!(this_present_grantedTime && that_present_grantedTime))
        return false;
      if (this.grantedTime != that.grantedTime)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_appInfo = true && this.isSetAppInfo();
    boolean that_present_appInfo = true && that.isSetAppInfo();
    if (this_present_appInfo || that_present_appInfo) {
      if (!(this_present_appInfo && that_present_appInfo))
        return false;
      if (!this.appInfo.equals(that.appInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ResourceGrant other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ResourceGrant typedOther = (ResourceGrant)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeName()).compareTo(typedOther.isSetNodeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeName, typedOther.nodeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(typedOther.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, typedOther.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantedTime()).compareTo(typedOther.isSetGrantedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantedTime, typedOther.grantedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppInfo()).compareTo(typedOther.isSetAppInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appInfo, typedOther.appInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.id = iprot.readI32();
            setIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NODE_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.nodeName = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ADDRESS
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.address = new InetAddress();
            this.address.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // GRANTED_TIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.grantedTime = iprot.readI64();
            setGrantedTimeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // TYPE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.type = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // APP_INFO
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.appInfo = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetGrantedTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'grantedTime' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI32(this.id);
    oprot.writeFieldEnd();
    if (this.nodeName != null) {
      oprot.writeFieldBegin(NODE_NAME_FIELD_DESC);
      oprot.writeString(this.nodeName);
      oprot.writeFieldEnd();
    }
    if (this.address != null) {
      oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
      this.address.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(GRANTED_TIME_FIELD_DESC);
    oprot.writeI64(this.grantedTime);
    oprot.writeFieldEnd();
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeString(this.type);
      oprot.writeFieldEnd();
    }
    if (this.appInfo != null) {
      if (isSetAppInfo()) {
        oprot.writeFieldBegin(APP_INFO_FIELD_DESC);
        oprot.writeString(this.appInfo);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ResourceGrant(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeName:");
    if (this.nodeName == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantedTime:");
    sb.append(this.grantedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetAppInfo()) {
      if (!first) sb.append(", ");
      sb.append("appInfo:");
      if (this.appInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.appInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (nodeName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeName' was not present! Struct: " + toString());
    }
    if (address == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'address' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'grantedTime' because it's a primitive and you chose the non-beans generator.
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

