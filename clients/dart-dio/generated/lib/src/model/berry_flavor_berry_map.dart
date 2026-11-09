//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_flavor_berry_map.g.dart';

/// BerryFlavorBerryMap
///
/// Properties:
/// * [potency] - How powerful the referenced flavor is for this berry.
/// * [berry] - The berry with the referenced flavor.
@BuiltValue()
abstract class BerryFlavorBerryMap implements Built<BerryFlavorBerryMap, BerryFlavorBerryMapBuilder> {
  /// How powerful the referenced flavor is for this berry.
  @BuiltValueField(wireName: r'potency')
  int get potency;

  /// The berry with the referenced flavor.
  @BuiltValueField(wireName: r'berry')
  BerrySummary get berry;

  BerryFlavorBerryMap._();

  factory BerryFlavorBerryMap([void updates(BerryFlavorBerryMapBuilder b)]) = _$BerryFlavorBerryMap;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryFlavorBerryMapBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryFlavorBerryMap> get serializer => _$BerryFlavorBerryMapSerializer();
}

class _$BerryFlavorBerryMapSerializer implements PrimitiveSerializer<BerryFlavorBerryMap> {
  @override
  final Iterable<Type> types = const [BerryFlavorBerryMap, _$BerryFlavorBerryMap];

  @override
  final String wireName = r'BerryFlavorBerryMap';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryFlavorBerryMap object, {
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
      specifiedType: const FullType(BerrySummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryFlavorBerryMap object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryFlavorBerryMapBuilder result,
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
            specifiedType: const FullType(BerrySummary),
          ) as BerrySummary;
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
  BerryFlavorBerryMap deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryFlavorBerryMapBuilder();
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


