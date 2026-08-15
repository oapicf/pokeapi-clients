//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_detail_flavors_inner_flavor.g.dart';

/// BerryDetailFlavorsInnerFlavor
///
/// Properties:
/// * [name] - The name of the flavor
/// * [url] - The URL to get more information about the flavor
@BuiltValue()
abstract class BerryDetailFlavorsInnerFlavor implements Built<BerryDetailFlavorsInnerFlavor, BerryDetailFlavorsInnerFlavorBuilder> {
  /// The name of the flavor
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The URL to get more information about the flavor
  @BuiltValueField(wireName: r'url')
  String? get url;

  BerryDetailFlavorsInnerFlavor._();

  factory BerryDetailFlavorsInnerFlavor([void updates(BerryDetailFlavorsInnerFlavorBuilder b)]) = _$BerryDetailFlavorsInnerFlavor;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryDetailFlavorsInnerFlavorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryDetailFlavorsInnerFlavor> get serializer => _$BerryDetailFlavorsInnerFlavorSerializer();
}

class _$BerryDetailFlavorsInnerFlavorSerializer implements PrimitiveSerializer<BerryDetailFlavorsInnerFlavor> {
  @override
  final Iterable<Type> types = const [BerryDetailFlavorsInnerFlavor, _$BerryDetailFlavorsInnerFlavor];

  @override
  final String wireName = r'BerryDetailFlavorsInnerFlavor';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryDetailFlavorsInnerFlavor object, {
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
    BerryDetailFlavorsInnerFlavor object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryDetailFlavorsInnerFlavorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  BerryDetailFlavorsInnerFlavor deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryDetailFlavorsInnerFlavorBuilder();
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

