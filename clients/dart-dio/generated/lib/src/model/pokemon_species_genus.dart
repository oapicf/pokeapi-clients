//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_genus.g.dart';

/// PokemonSpeciesGenus
///
/// Properties:
/// * [genus] - The localized genus for the referenced Pokémon species
/// * [language] - The language this genus is in.
@BuiltValue()
abstract class PokemonSpeciesGenus implements Built<PokemonSpeciesGenus, PokemonSpeciesGenusBuilder> {
  /// The localized genus for the referenced Pokémon species
  @BuiltValueField(wireName: r'genus')
  String get genus;

  /// The language this genus is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  PokemonSpeciesGenus._();

  factory PokemonSpeciesGenus([void updates(PokemonSpeciesGenusBuilder b)]) = _$PokemonSpeciesGenus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesGenusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesGenus> get serializer => _$PokemonSpeciesGenusSerializer();
}

class _$PokemonSpeciesGenusSerializer implements PrimitiveSerializer<PokemonSpeciesGenus> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesGenus, _$PokemonSpeciesGenus];

  @override
  final String wireName = r'PokemonSpeciesGenus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesGenus object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'genus';
    yield serializers.serialize(
      object.genus,
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
    PokemonSpeciesGenus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesGenusBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'genus':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.genus = valueDes;
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
  PokemonSpeciesGenus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesGenusBuilder();
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


