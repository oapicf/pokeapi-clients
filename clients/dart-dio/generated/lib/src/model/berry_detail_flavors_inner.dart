//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_detail_flavors_inner_flavor.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_detail_flavors_inner.g.dart';

/// BerryDetailFlavorsInner
///
/// Properties:
/// * [potency] 
/// * [flavor] 
@BuiltValue()
abstract class BerryDetailFlavorsInner implements Built<BerryDetailFlavorsInner, BerryDetailFlavorsInnerBuilder> {
  @BuiltValueField(wireName: r'potency')
  int get potency;

  @BuiltValueField(wireName: r'flavor')
  BerryDetailFlavorsInnerFlavor get flavor;

  BerryDetailFlavorsInner._();

  factory BerryDetailFlavorsInner([void updates(BerryDetailFlavorsInnerBuilder b)]) = _$BerryDetailFlavorsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryDetailFlavorsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryDetailFlavorsInner> get serializer => _$BerryDetailFlavorsInnerSerializer();
}

class _$BerryDetailFlavorsInnerSerializer implements PrimitiveSerializer<BerryDetailFlavorsInner> {
  @override
  final Iterable<Type> types = const [BerryDetailFlavorsInner, _$BerryDetailFlavorsInner];

  @override
  final String wireName = r'BerryDetailFlavorsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryDetailFlavorsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'potency';
    yield serializers.serialize(
      object.potency,
      specifiedType: const FullType(int),
    );
    yield r'flavor';
    yield serializers.serialize(
      object.flavor,
      specifiedType: const FullType(BerryDetailFlavorsInnerFlavor),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryDetailFlavorsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryDetailFlavorsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'potency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.potency = valueDes;
          break;
        case r'flavor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BerryDetailFlavorsInnerFlavor),
          ) as BerryDetailFlavorsInnerFlavor;
          result.flavor.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BerryDetailFlavorsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryDetailFlavorsInnerBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

