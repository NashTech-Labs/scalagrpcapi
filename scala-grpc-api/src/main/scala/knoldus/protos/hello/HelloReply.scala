// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package knoldus.protos.hello

/** The response message containing the greetings
  */
@SerialVersionUID(0L)
final case class HelloReply(
    message: _root_.scala.Predef.String = "",
    ac: _root_.scala.collection.Seq[_root_.scala.Int] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[HelloReply] with scalapb.lenses.Updatable[HelloReply] {
    private[this] def acSerializedSize = {
      if (__acSerializedSizeField == 0) __acSerializedSizeField = {
        var __s: _root_.scala.Int = 0
        ac.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
        __s
      }
      __acSerializedSizeField
    }
    @transient private[this] var __acSerializedSizeField: _root_.scala.Int = 0
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = message
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if(ac.nonEmpty) {
        val __localsize = acSerializedSize
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = message
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      if (ac.nonEmpty) {
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(acSerializedSize)
        ac.foreach(_output__.writeInt32NoTag)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): knoldus.protos.hello.HelloReply = {
      var __message = this.message
      val __ac = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int] ++= this.ac)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __message = _input__.readString()
          case 16 =>
            __ac += _input__.readInt32()
          case 18 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __ac += _input__.readInt32
            }
            _input__.popLimit(oldLimit)
          }
          case tag => _input__.skipField(tag)
        }
      }
      knoldus.protos.hello.HelloReply(
          message = __message,
          ac = __ac.result()
      )
    }
    def withMessage(__v: _root_.scala.Predef.String): HelloReply = copy(message = __v)
    def clearAc = copy(ac = _root_.scala.collection.Seq.empty)
    def addAc(__vs: _root_.scala.Int*): HelloReply = addAllAc(__vs)
    def addAllAc(__vs: TraversableOnce[_root_.scala.Int]): HelloReply = copy(ac = ac ++ __vs)
    def withAc(__v: _root_.scala.collection.Seq[_root_.scala.Int]): HelloReply = copy(ac = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = message
          if (__t != "") __t else null
        }
        case 2 => ac
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(message)
        case 2 => _root_.scalapb.descriptors.PRepeated(ac.map(_root_.scalapb.descriptors.PInt)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = knoldus.protos.hello.HelloReply
}

object HelloReply extends scalapb.GeneratedMessageCompanion[knoldus.protos.hello.HelloReply] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[knoldus.protos.hello.HelloReply] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): knoldus.protos.hello.HelloReply = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    knoldus.protos.hello.HelloReply(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Int]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[knoldus.protos.hello.HelloReply] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      knoldus.protos.hello.HelloReply(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HelloProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HelloProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = knoldus.protos.hello.HelloReply(
  )
  final val MESSAGE_FIELD_NUMBER = 1
  final val AC_FIELD_NUMBER = 2
  def of(
    message: _root_.scala.Predef.String,
    ac: _root_.scala.collection.Seq[_root_.scala.Int]
  ): _root_.knoldus.protos.hello.HelloReply = _root_.knoldus.protos.hello.HelloReply(
    message,
    ac
  )
}