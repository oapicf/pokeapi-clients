//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_damage_class_summary.g.dart';

/// MoveDamageClassSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class MoveDamageClassSummary implements Built<MoveDamageClassSummary, MoveDamageClassSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  MoveDamageClassSummary._();

  factory MoveDamageClassSummary([void updates(MoveDamageClassSummaryBuilder b)]) = _$MoveDamageClassSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDamageClassSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDamageClassSummary> get serializer => _$MoveDamageClassSummarySerializer();
}

class _$MoveDamageClassSummarySerializer implements PrimitiveSerializer<MoveDamageClassSummary> {
  @override
  final Iterable<Type> types = const [MoveDamageClassSummary, _$MoveDamageClassSummary];

  @override
  final String wireName = r'MoveDamageClassSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDamageClassSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDamageClassSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDamageClassSummaryBuilder result,
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
  MoveDamageClassSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDamageClassSummaryBuilder();
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

