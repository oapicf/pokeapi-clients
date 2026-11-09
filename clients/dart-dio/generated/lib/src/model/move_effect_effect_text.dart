//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_effect_effect_text.g.dart';

/// MoveEffectEffectText
///
/// Properties:
/// * [effect] - The localized effect text for an API resource in a specific language.
/// * [shortEffect] - The localized effect text in brief.
/// * [language] - The language this effect is in.
@BuiltValue()
abstract class MoveEffectEffectText implements Built<MoveEffectEffectText, MoveEffectEffectTextBuilder> {
  /// The localized effect text for an API resource in a specific language.
  @BuiltValueField(wireName: r'effect')
  String get effect;

  /// The localized effect text in brief.
  @BuiltValueField(wireName: r'short_effect')
  String get shortEffect;

  /// The language this effect is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  MoveEffectEffectText._();

  factory MoveEffectEffectText([void updates(MoveEffectEffectTextBuilder b)]) = _$MoveEffectEffectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveEffectEffectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveEffectEffectText> get serializer => _$MoveEffectEffectTextSerializer();
}

class _$MoveEffectEffectTextSerializer implements PrimitiveSerializer<MoveEffectEffectText> {
  @override
  final Iterable<Type> types = const [MoveEffectEffectText, _$MoveEffectEffectText];

  @override
  final String wireName = r'MoveEffectEffectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveEffectEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'effect';
    yield serializers.serialize(
      object.effect,
      specifiedType: const FullType(String),
    );
    yield r'short_effect';
    yield serializers.serialize(
      object.shortEffect,
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
    MoveEffectEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveEffectEffectTextBuilder result,
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
        case r'short_effect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.shortEffect = valueDes;
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
  MoveEffectEffectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveEffectEffectTextBuilder();
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


