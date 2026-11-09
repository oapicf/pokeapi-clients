//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_name.g.dart';

/// PokemonSpeciesName
///
/// Properties:
/// * [name] - The localized name for an API resource in a specific language.
/// * [language] - The language this name is in.
@BuiltValue()
abstract class PokemonSpeciesName implements Built<PokemonSpeciesName, PokemonSpeciesNameBuilder> {
  /// The localized name for an API resource in a specific language.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The language this name is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  PokemonSpeciesName._();

  factory PokemonSpeciesName([void updates(PokemonSpeciesNameBuilder b)]) = _$PokemonSpeciesName;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesNameBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesName> get serializer => _$PokemonSpeciesNameSerializer();
}

class _$PokemonSpeciesNameSerializer implements PrimitiveSerializer<PokemonSpeciesName> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesName, _$PokemonSpeciesName];

  @override
  final String wireName = r'PokemonSpeciesName';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesName object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
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
    PokemonSpeciesName object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesNameBuilder result,
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
  PokemonSpeciesName deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesNameBuilder();
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


