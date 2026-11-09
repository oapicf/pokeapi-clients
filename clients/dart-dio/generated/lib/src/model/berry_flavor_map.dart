//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_flavor_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_flavor_map.g.dart';

/// BerryFlavorMap
///
/// Properties:
/// * [potency] - How powerful the referenced flavor is for this berry.
/// * [flavor] - The referenced berry flavor.
@BuiltValue()
abstract class BerryFlavorMap implements Built<BerryFlavorMap, BerryFlavorMapBuilder> {
  /// How powerful the referenced flavor is for this berry.
  @BuiltValueField(wireName: r'potency')
  int get potency;

  /// The referenced berry flavor.
  @BuiltValueField(wireName: r'flavor')
  BerryFlavorSummary get flavor;

  BerryFlavorMap._();

  factory BerryFlavorMap([void updates(BerryFlavorMapBuilder b)]) = _$BerryFlavorMap;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryFlavorMapBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryFlavorMap> get serializer => _$BerryFlavorMapSerializer();
}

class _$BerryFlavorMapSerializer implements PrimitiveSerializer<BerryFlavorMap> {
  @override
  final Iterable<Type> types = const [BerryFlavorMap, _$BerryFlavorMap];

  @override
  final String wireName = r'BerryFlavorMap';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryFlavorMap object, {
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
      specifiedType: const FullType(BerryFlavorSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryFlavorMap object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryFlavorMapBuilder result,
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
            specifiedType: const FullType(BerryFlavorSummary),
          ) as BerryFlavorSummary;
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
  BerryFlavorMap deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryFlavorMapBuilder();
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


