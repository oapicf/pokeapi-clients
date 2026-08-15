//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'contest_effect_effect_text.g.dart';

/// ContestEffectEffectText
///
/// Properties:
/// * [effect] 
/// * [language] 
@BuiltValue()
abstract class ContestEffectEffectText implements Built<ContestEffectEffectText, ContestEffectEffectTextBuilder> {
  @BuiltValueField(wireName: r'effect')
  String get effect;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  ContestEffectEffectText._();

  factory ContestEffectEffectText([void updates(ContestEffectEffectTextBuilder b)]) = _$ContestEffectEffectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ContestEffectEffectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ContestEffectEffectText> get serializer => _$ContestEffectEffectTextSerializer();
}

class _$ContestEffectEffectTextSerializer implements PrimitiveSerializer<ContestEffectEffectText> {
  @override
  final Iterable<Type> types = const [ContestEffectEffectText, _$ContestEffectEffectText];

  @override
  final String wireName = r'ContestEffectEffectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ContestEffectEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect';
    yield serializers.serialize(
      object.effect,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ContestEffectEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ContestEffectEffectTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.effect = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageSummary),
          ) as LanguageSummary;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ContestEffectEffectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ContestEffectEffectTextBuilder();
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

