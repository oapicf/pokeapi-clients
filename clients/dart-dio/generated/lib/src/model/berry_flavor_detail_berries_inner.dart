//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_flavor_detail_berries_inner_berry.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_flavor_detail_berries_inner.g.dart';

/// BerryFlavorDetailBerriesInner
///
/// Properties:
/// * [potency] 
/// * [berry] 
@BuiltValue()
abstract class BerryFlavorDetailBerriesInner implements Built<BerryFlavorDetailBerriesInner, BerryFlavorDetailBerriesInnerBuilder> {
  @BuiltValueField(wireName: r'potency')
  int get potency;

  @BuiltValueField(wireName: r'berry')
  BerryFlavorDetailBerriesInnerBerry get berry;

  BerryFlavorDetailBerriesInner._();

  factory BerryFlavorDetailBerriesInner([void updates(BerryFlavorDetailBerriesInnerBuilder b)]) = _$BerryFlavorDetailBerriesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryFlavorDetailBerriesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryFlavorDetailBerriesInner> get serializer => _$BerryFlavorDetailBerriesInnerSerializer();
}

class _$BerryFlavorDetailBerriesInnerSerializer implements PrimitiveSerializer<BerryFlavorDetailBerriesInner> {
  @override
  final Iterable<Type> types = const [BerryFlavorDetailBerriesInner, _$BerryFlavorDetailBerriesInner];

  @override
  final String wireName = r'BerryFlavorDetailBerriesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryFlavorDetailBerriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'potency';
    yield serializers.serialize(
      object.potency,
      specifiedType: const FullType(int),
    );
    yield r'berry';
    yield serializers.serialize(
      object.berry,
      specifiedType: const FullType(BerryFlavorDetailBerriesInnerBerry),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryFlavorDetailBerriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryFlavorDetailBerriesInnerBuilder result,
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
        case r'berry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BerryFlavorDetailBerriesInnerBerry),
          ) as BerryFlavorDetailBerriesInnerBerry;
          result.berry.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BerryFlavorDetailBerriesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryFlavorDetailBerriesInnerBuilder();
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

