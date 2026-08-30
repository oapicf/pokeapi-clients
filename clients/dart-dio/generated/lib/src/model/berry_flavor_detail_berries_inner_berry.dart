//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_flavor_detail_berries_inner_berry.g.dart';

/// BerryFlavorDetailBerriesInnerBerry
///
/// Properties:
/// * [name] - The name of the berry
/// * [url] - The URL to get more information about the berry
@BuiltValue()
abstract class BerryFlavorDetailBerriesInnerBerry implements Built<BerryFlavorDetailBerriesInnerBerry, BerryFlavorDetailBerriesInnerBerryBuilder> {
  /// The name of the berry
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The URL to get more information about the berry
  @BuiltValueField(wireName: r'url')
  String? get url;

  BerryFlavorDetailBerriesInnerBerry._();

  factory BerryFlavorDetailBerriesInnerBerry([void updates(BerryFlavorDetailBerriesInnerBerryBuilder b)]) = _$BerryFlavorDetailBerriesInnerBerry;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryFlavorDetailBerriesInnerBerryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryFlavorDetailBerriesInnerBerry> get serializer => _$BerryFlavorDetailBerriesInnerBerrySerializer();
}

class _$BerryFlavorDetailBerriesInnerBerrySerializer implements PrimitiveSerializer<BerryFlavorDetailBerriesInnerBerry> {
  @override
  final Iterable<Type> types = const [BerryFlavorDetailBerriesInnerBerry, _$BerryFlavorDetailBerriesInnerBerry];

  @override
  final String wireName = r'BerryFlavorDetailBerriesInnerBerry';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryFlavorDetailBerriesInnerBerry object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryFlavorDetailBerriesInnerBerry object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryFlavorDetailBerriesInnerBerryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BerryFlavorDetailBerriesInnerBerry deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryFlavorDetailBerriesInnerBerryBuilder();
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

