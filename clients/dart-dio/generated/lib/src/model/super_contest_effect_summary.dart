//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'super_contest_effect_summary.g.dart';

/// SuperContestEffectSummary
///
/// Properties:
/// * [url] 
@BuiltValue()
abstract class SuperContestEffectSummary implements Built<SuperContestEffectSummary, SuperContestEffectSummaryBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  SuperContestEffectSummary._();

  factory SuperContestEffectSummary([void updates(SuperContestEffectSummaryBuilder b)]) = _$SuperContestEffectSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SuperContestEffectSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SuperContestEffectSummary> get serializer => _$SuperContestEffectSummarySerializer();
}

class _$SuperContestEffectSummarySerializer implements PrimitiveSerializer<SuperContestEffectSummary> {
  @override
  final Iterable<Type> types = const [SuperContestEffectSummary, _$SuperContestEffectSummary];

  @override
  final String wireName = r'SuperContestEffectSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SuperContestEffectSummary object, {
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
    SuperContestEffectSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SuperContestEffectSummaryBuilder result,
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
  SuperContestEffectSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SuperContestEffectSummaryBuilder();
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

