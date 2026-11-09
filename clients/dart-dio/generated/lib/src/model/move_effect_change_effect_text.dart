//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_effect_change_effect_text.g.dart';

/// MoveEffectChangeEffectText
///
/// Properties:
/// * [effect] - The localized effect text for an API resource in a specific language.
/// * [language] - The language this effect is in.
@BuiltValue()
abstract class MoveEffectChangeEffectText implements Built<MoveEffectChangeEffectText, MoveEffectChangeEffectTextBuilder> {
  /// The localized effect text for an API resource in a specific language.
  @BuiltValueField(wireName: r'effect')
  String get effect;

  /// The language this effect is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  MoveEffectChangeEffectText._();

  factory MoveEffectChangeEffectText([void updates(MoveEffectChangeEffectTextBuilder b)]) = _$MoveEffectChangeEffectText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveEffectChangeEffectTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveEffectChangeEffectText> get serializer => _$MoveEffectChangeEffectTextSerializer();
}

class _$MoveEffectChangeEffectTextSerializer implements PrimitiveSerializer<MoveEffectChangeEffectText> {
  @override
  final Iterable<Type> types = const [MoveEffectChangeEffectText, _$MoveEffectChangeEffectText];

  @override
  final String wireName = r'MoveEffectChangeEffectText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveEffectChangeEffectText object, {
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
    MoveEffectChangeEffectText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveEffectChangeEffectTextBuilder result,
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
  MoveEffectChangeEffectText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveEffectChangeEffectTextBuilder();
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


