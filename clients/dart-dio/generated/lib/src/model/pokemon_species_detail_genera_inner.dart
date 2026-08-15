//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_detail_genera_inner.g.dart';

/// PokemonSpeciesDetailGeneraInner
///
/// Properties:
/// * [genus] 
/// * [language] 
@BuiltValue()
abstract class PokemonSpeciesDetailGeneraInner implements Built<PokemonSpeciesDetailGeneraInner, PokemonSpeciesDetailGeneraInnerBuilder> {
  @BuiltValueField(wireName: r'genus')
  String get genus;

  @BuiltValueField(wireName: r'language')
  AbilityDetailPokemonInnerPokemon get language;

  PokemonSpeciesDetailGeneraInner._();

  factory PokemonSpeciesDetailGeneraInner([void updates(PokemonSpeciesDetailGeneraInnerBuilder b)]) = _$PokemonSpeciesDetailGeneraInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesDetailGeneraInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesDetailGeneraInner> get serializer => _$PokemonSpeciesDetailGeneraInnerSerializer();
}

class _$PokemonSpeciesDetailGeneraInnerSerializer implements PrimitiveSerializer<PokemonSpeciesDetailGeneraInner> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesDetailGeneraInner, _$PokemonSpeciesDetailGeneraInner];

  @override
  final String wireName = r'PokemonSpeciesDetailGeneraInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesDetailGeneraInner object, {
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
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpeciesDetailGeneraInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesDetailGeneraInnerBuilder result,
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
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
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
  PokemonSpeciesDetailGeneraInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesDetailGeneraInnerBuilder();
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

