// Generated by the protocol buffer compiler.  DO NOT EDIT!

package gctraveltools.jsj.com.cn.servers1.bean.nano;

@SuppressWarnings("hiding")
public final class TravelDto2 extends
    com.google.protobuf.nano.android.ParcelableMessageNano {

  // Used by Parcelable
  @SuppressWarnings({"unused"})
  public static final android.os.Parcelable.Creator<TravelDto2> CREATOR =
      new com.google.protobuf.nano.android.ParcelableMessageNanoCreator<
          TravelDto2>(TravelDto2.class);

  private static volatile TravelDto2[] _emptyArray;
  public static TravelDto2[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new TravelDto2[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional string TravelTitle = 1;
  public java.lang.String travelTitle;

  // optional .TravelType TravelType = 2 [default = UnSetting];
  public int travelType;

  // optional double Amount = 3 [default = 0];
  public double amount;

  // optional int32 Status = 4 [default = 0];
  public int status;

  // optional .PaymentTravelOrderStatus PaymentTravelOrderStatus = 5 [default = UnSet];
  public int paymentTravelOrderStatus;

  // optional string ContactMobile = 6;
  public java.lang.String contactMobile;

  // optional string ContactName = 7;
  public java.lang.String contactName;

  // optional string Ext = 8;
  public java.lang.String ext;

  // repeated .TravelDto2 TravelDto2s = 9;
  public gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2[] travelDto2S;

  // optional .OrderIdentity OrderIdentity = 10 [default = UnOrder];
  public int orderIdentity;

  // optional int32 JSJID = 11 [default = 0];
  public int jSJID;

  // optional string ICAOCode = 12;
  public java.lang.String iCAOCode;

  // repeated .TerminalServiceDto TerminalServiceDtos = 13;
  public gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto[] terminalServiceDtos;

  // optional bool IsProvideService = 14 [default = false];
  public boolean isProvideService;

  // optional string TrainOrRailName = 15;
  public java.lang.String trainOrRailName;

  // optional string TrainOrRailCode = 16;
  public java.lang.String trainOrRailCode;

  // optional .GroupServiceType GroupServiceType = 17 [default = GroupServiceTypeUnSetting];
  public int groupServiceType;

  // optional int64 TravelDayStamp = 18 [default = 0];
  public long travelDayStamp;

  // optional string FlightNumber = 19;
  public java.lang.String flightNumber;

  // repeated .NodeDto NoteDtos = 20;
  public gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto[] noteDtos;

  // optional int32 TravelID = 21 [default = 0];
  public int travelID;

  // optional string JSJOrderID = 22;
  public java.lang.String jSJOrderID;

  public TravelDto2() {
    clear();
  }

  public TravelDto2 clear() {
    travelTitle = "";
    travelType = gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting;
    amount = 0D;
    status = 0;
    paymentTravelOrderStatus = gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.UnSet;
    contactMobile = "";
    contactName = "";
    ext = "";
    travelDto2S = gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2.emptyArray();
    orderIdentity = gctraveltools.jsj.com.cn.servers1.bean.nano.OrderIdentity.UnOrder;
    jSJID = 0;
    iCAOCode = "";
    terminalServiceDtos = gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto.emptyArray();
    isProvideService = false;
    trainOrRailName = "";
    trainOrRailCode = "";
    groupServiceType = gctraveltools.jsj.com.cn.servers1.bean.nano.GroupServiceType.GroupServiceTypeUnSetting;
    travelDayStamp = 0L;
    flightNumber = "";
    noteDtos = gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto.emptyArray();
    travelID = 0;
    jSJOrderID = "";
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (!this.travelTitle.equals("")) {
      output.writeString(1, this.travelTitle);
    }
    if (this.travelType != gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting) {
      output.writeInt32(2, this.travelType);
    }
    if (java.lang.Double.doubleToLongBits(this.amount)
        != java.lang.Double.doubleToLongBits(0D)) {
      output.writeDouble(3, this.amount);
    }
    if (this.status != 0) {
      output.writeInt32(4, this.status);
    }
    if (this.paymentTravelOrderStatus != gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.UnSet) {
      output.writeInt32(5, this.paymentTravelOrderStatus);
    }
    if (!this.contactMobile.equals("")) {
      output.writeString(6, this.contactMobile);
    }
    if (!this.contactName.equals("")) {
      output.writeString(7, this.contactName);
    }
    if (!this.ext.equals("")) {
      output.writeString(8, this.ext);
    }
    if (this.travelDto2S != null && this.travelDto2S.length > 0) {
      for (int i = 0; i < this.travelDto2S.length; i++) {
        gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2 element = this.travelDto2S[i];
        if (element != null) {
          output.writeMessage(9, element);
        }
      }
    }
    if (this.orderIdentity != gctraveltools.jsj.com.cn.servers1.bean.nano.OrderIdentity.UnOrder) {
      output.writeInt32(10, this.orderIdentity);
    }
    if (this.jSJID != 0) {
      output.writeInt32(11, this.jSJID);
    }
    if (!this.iCAOCode.equals("")) {
      output.writeString(12, this.iCAOCode);
    }
    if (this.terminalServiceDtos != null && this.terminalServiceDtos.length > 0) {
      for (int i = 0; i < this.terminalServiceDtos.length; i++) {
        gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto element = this.terminalServiceDtos[i];
        if (element != null) {
          output.writeMessage(13, element);
        }
      }
    }
    if (this.isProvideService != false) {
      output.writeBool(14, this.isProvideService);
    }
    if (!this.trainOrRailName.equals("")) {
      output.writeString(15, this.trainOrRailName);
    }
    if (!this.trainOrRailCode.equals("")) {
      output.writeString(16, this.trainOrRailCode);
    }
    if (this.groupServiceType != gctraveltools.jsj.com.cn.servers1.bean.nano.GroupServiceType.GroupServiceTypeUnSetting) {
      output.writeInt32(17, this.groupServiceType);
    }
    if (this.travelDayStamp != 0L) {
      output.writeInt64(18, this.travelDayStamp);
    }
    if (!this.flightNumber.equals("")) {
      output.writeString(19, this.flightNumber);
    }
    if (this.noteDtos != null && this.noteDtos.length > 0) {
      for (int i = 0; i < this.noteDtos.length; i++) {
        gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto element = this.noteDtos[i];
        if (element != null) {
          output.writeMessage(20, element);
        }
      }
    }
    if (this.travelID != 0) {
      output.writeInt32(21, this.travelID);
    }
    if (!this.jSJOrderID.equals("")) {
      output.writeString(22, this.jSJOrderID);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (!this.travelTitle.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(1, this.travelTitle);
    }
    if (this.travelType != gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeInt32Size(2, this.travelType);
    }
    if (java.lang.Double.doubleToLongBits(this.amount)
        != java.lang.Double.doubleToLongBits(0D)) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeDoubleSize(3, this.amount);
    }
    if (this.status != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(4, this.status);
    }
    if (this.paymentTravelOrderStatus != gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.UnSet) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeInt32Size(5, this.paymentTravelOrderStatus);
    }
    if (!this.contactMobile.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(6, this.contactMobile);
    }
    if (!this.contactName.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(7, this.contactName);
    }
    if (!this.ext.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(8, this.ext);
    }
    if (this.travelDto2S != null && this.travelDto2S.length > 0) {
      for (int i = 0; i < this.travelDto2S.length; i++) {
        gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2 element = this.travelDto2S[i];
        if (element != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeMessageSize(9, element);
        }
      }
    }
    if (this.orderIdentity != gctraveltools.jsj.com.cn.servers1.bean.nano.OrderIdentity.UnOrder) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeInt32Size(10, this.orderIdentity);
    }
    if (this.jSJID != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(11, this.jSJID);
    }
    if (!this.iCAOCode.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(12, this.iCAOCode);
    }
    if (this.terminalServiceDtos != null && this.terminalServiceDtos.length > 0) {
      for (int i = 0; i < this.terminalServiceDtos.length; i++) {
        gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto element = this.terminalServiceDtos[i];
        if (element != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeMessageSize(13, element);
        }
      }
    }
    if (this.isProvideService != false) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeBoolSize(14, this.isProvideService);
    }
    if (!this.trainOrRailName.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(15, this.trainOrRailName);
    }
    if (!this.trainOrRailCode.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(16, this.trainOrRailCode);
    }
    if (this.groupServiceType != gctraveltools.jsj.com.cn.servers1.bean.nano.GroupServiceType.GroupServiceTypeUnSetting) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeInt32Size(17, this.groupServiceType);
    }
    if (this.travelDayStamp != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(18, this.travelDayStamp);
    }
    if (!this.flightNumber.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(19, this.flightNumber);
    }
    if (this.noteDtos != null && this.noteDtos.length > 0) {
      for (int i = 0; i < this.noteDtos.length; i++) {
        gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto element = this.noteDtos[i];
        if (element != null) {
          size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeMessageSize(20, element);
        }
      }
    }
    if (this.travelID != 0) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(21, this.travelID);
    }
    if (!this.jSJOrderID.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(22, this.jSJOrderID);
    }
    return size;
  }

  @Override
  public TravelDto2 mergeFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default: {
          if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
            return this;
          }
          break;
        }
        case 10: {
          this.travelTitle = input.readString();
          break;
        }
        case 16: {
          int value = input.readInt32();
          switch (value) {
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.UnSetting:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.AirportTravel:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.RailportTravel:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipHall:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Boarding:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VipChannel:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.VVipHall:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.Assistant:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.TravelType.CombinedOrder:
              this.travelType = value;
              break;
          }
          break;
        }
        case 25: {
          this.amount = input.readDouble();
          break;
        }
        case 32: {
          this.status = input.readInt32();
          break;
        }
        case 40: {
          int value = input.readInt32();
          switch (value) {
            case gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.UnSet:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.UnPay:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.Paying:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.PaySuccessed:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.PaymentTravelOrderStatus.PayFailed:
              this.paymentTravelOrderStatus = value;
              break;
          }
          break;
        }
        case 50: {
          this.contactMobile = input.readString();
          break;
        }
        case 58: {
          this.contactName = input.readString();
          break;
        }
        case 66: {
          this.ext = input.readString();
          break;
        }
        case 74: {
          int arrayLength = com.google.protobuf.nano.WireFormatNano
              .getRepeatedFieldArrayLength(input, 74);
          int i = this.travelDto2S == null ? 0 : this.travelDto2S.length;
          gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2[] newArray =
              new gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2[i + arrayLength];
          if (i != 0) {
            java.lang.System.arraycopy(this.travelDto2S, 0, newArray, 0, i);
          }
          for (; i < newArray.length - 1; i++) {
            newArray[i] = new gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2();
            input.readMessage(newArray[i]);
            input.readTag();
          }
          // Last one without readTag.
          newArray[i] = new gctraveltools.jsj.com.cn.servers1.bean.nano.TravelDto2();
          input.readMessage(newArray[i]);
          this.travelDto2S = newArray;
          break;
        }
        case 80: {
          int value = input.readInt32();
          switch (value) {
            case gctraveltools.jsj.com.cn.servers1.bean.nano.OrderIdentity.UnOrder:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.OrderIdentity.BigOrder:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.OrderIdentity.FinnalOrder:
              this.orderIdentity = value;
              break;
          }
          break;
        }
        case 88: {
          this.jSJID = input.readInt32();
          break;
        }
        case 98: {
          this.iCAOCode = input.readString();
          break;
        }
        case 106: {
          int arrayLength = com.google.protobuf.nano.WireFormatNano
              .getRepeatedFieldArrayLength(input, 106);
          int i = this.terminalServiceDtos == null ? 0 : this.terminalServiceDtos.length;
          gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto[] newArray =
              new gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto[i + arrayLength];
          if (i != 0) {
            java.lang.System.arraycopy(this.terminalServiceDtos, 0, newArray, 0, i);
          }
          for (; i < newArray.length - 1; i++) {
            newArray[i] = new gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto();
            input.readMessage(newArray[i]);
            input.readTag();
          }
          // Last one without readTag.
          newArray[i] = new gctraveltools.jsj.com.cn.servers1.bean.nano.TerminalServiceDto();
          input.readMessage(newArray[i]);
          this.terminalServiceDtos = newArray;
          break;
        }
        case 112: {
          this.isProvideService = input.readBool();
          break;
        }
        case 122: {
          this.trainOrRailName = input.readString();
          break;
        }
        case 130: {
          this.trainOrRailCode = input.readString();
          break;
        }
        case 136: {
          int value = input.readInt32();
          switch (value) {
            case gctraveltools.jsj.com.cn.servers1.bean.nano.GroupServiceType.GroupServiceTypeUnSetting:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.GroupServiceType.GroupServiceTypeAirport:
            case gctraveltools.jsj.com.cn.servers1.bean.nano.GroupServiceType.GroupServiceTypeTrain:
              this.groupServiceType = value;
              break;
          }
          break;
        }
        case 144: {
          this.travelDayStamp = input.readInt64();
          break;
        }
        case 154: {
          this.flightNumber = input.readString();
          break;
        }
        case 162: {
          int arrayLength = com.google.protobuf.nano.WireFormatNano
              .getRepeatedFieldArrayLength(input, 162);
          int i = this.noteDtos == null ? 0 : this.noteDtos.length;
          gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto[] newArray =
              new gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto[i + arrayLength];
          if (i != 0) {
            java.lang.System.arraycopy(this.noteDtos, 0, newArray, 0, i);
          }
          for (; i < newArray.length - 1; i++) {
            newArray[i] = new gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto();
            input.readMessage(newArray[i]);
            input.readTag();
          }
          // Last one without readTag.
          newArray[i] = new gctraveltools.jsj.com.cn.servers1.bean.nano.NodeDto();
          input.readMessage(newArray[i]);
          this.noteDtos = newArray;
          break;
        }
        case 168: {
          this.travelID = input.readInt32();
          break;
        }
        case 178: {
          this.jSJOrderID = input.readString();
          break;
        }
      }
    }
  }

  public static TravelDto2 parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new TravelDto2(), data);
  }

  public static TravelDto2 parseFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new TravelDto2().mergeFrom(input);
  }
}
