//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_variable_description.g.dart';

/// EvolutionVariableDescription
///
/// Properties:
/// * [description] - The localized description for an API resource in a specific language.
/// * [language] - The language this name is in.
@BuiltValue()
abstract class EvolutionVariableDescription implements Built<EvolutionVariableDescription, EvolutionVariableDescriptionBuilder> {
  /// The localized description for an API resource in a specific language.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// The language this name is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  EvolutionVariableDescription._();

  factory EvolutionVariableDescription([void updates(EvolutionVariableDescriptionBuilder b)]) = _$EvolutionVariableDescription;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionVariableDescriptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionVariableDescription> get serializer => _$EvolutionVariableDescriptionSerializer();
}

class _$EvolutionVariableDescriptionSerializer implements PrimitiveSerializer<EvolutionVariableDescription> {
  @override
  final Iterable<Type> types = const [EvolutionVariableDescription, _$EvolutionVariableDescription];

  @override
  final String wireName = r'EvolutionVariableDescription';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionVariableDescription object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionVariableDescription object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionVariableDescriptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
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
  EvolutionVariableDescription deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionVariableDescriptionBuilder();
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


