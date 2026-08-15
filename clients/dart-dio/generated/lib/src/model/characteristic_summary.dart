//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'characteristic_summary.g.dart';

/// CharacteristicSummary
///
/// Properties:
/// * [url] 
@BuiltValue()
abstract class CharacteristicSummary implements Built<CharacteristicSummary, CharacteristicSummaryBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  CharacteristicSummary._();

  factory CharacteristicSummary([void updates(CharacteristicSummaryBuilder b)]) = _$CharacteristicSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CharacteristicSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CharacteristicSummary> get serializer => _$CharacteristicSummarySerializer();
}

class _$CharacteristicSummarySerializer implements PrimitiveSerializer<CharacteristicSummary> {
  @override
  final Iterable<Type> types = const [CharacteristicSummary, _$CharacteristicSummary];

  @override
  final String wireName = r'CharacteristicSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CharacteristicSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CharacteristicSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CharacteristicSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  CharacteristicSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CharacteristicSummaryBuilder();
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

