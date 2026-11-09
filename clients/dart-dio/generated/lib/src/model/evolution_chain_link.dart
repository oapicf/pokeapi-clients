//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:openapi/src/model/pokemon_evolution.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_link.g.dart';

/// EvolutionChainLink
///
/// Properties:
/// * [isBaby] - Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
/// * [species] - The Pokémon species at this point in the evolution chain.
/// * [evolutionDetails] - All details regarding the specific details of the referenced Pokémon species evolution.
/// * [evolvesTo] - A List of chain objects.
@BuiltValue()
abstract class EvolutionChainLink implements Built<EvolutionChainLink, EvolutionChainLinkBuilder> {
  /// Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
  @BuiltValueField(wireName: r'is_baby')
  bool get isBaby;

  /// The Pokémon species at this point in the evolution chain.
  @BuiltValueField(wireName: r'species')
  PokemonSpeciesSummary get species;

  /// All details regarding the specific details of the referenced Pokémon species evolution.
  @BuiltValueField(wireName: r'evolution_details')
  BuiltList<PokemonEvolution> get evolutionDetails;

  /// A List of chain objects.
  @BuiltValueField(wireName: r'evolves_to')
  BuiltList<EvolutionChainLink> get evolvesTo;

  EvolutionChainLink._();

  factory EvolutionChainLink([void updates(EvolutionChainLinkBuilder b)]) = _$EvolutionChainLink;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainLinkBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainLink> get serializer => _$EvolutionChainLinkSerializer();
}

class _$EvolutionChainLinkSerializer implements PrimitiveSerializer<EvolutionChainLink> {
  @override
  final Iterable<Type> types = const [EvolutionChainLink, _$EvolutionChainLink];

  @override
  final String wireName = r'EvolutionChainLink';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainLink object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'is_baby';
    yield serializers.serialize(
      object.isBaby,
      specifiedType: const FullType(bool),
    );
    yield r'species';
    yield serializers.serialize(
      object.species,
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
    yield r'evolution_details';
    yield serializers.serialize(
      object.evolutionDetails,
      specifiedType: const FullType(BuiltList, [FullType(PokemonEvolution)]),
    );
    yield r'evolves_to';
    yield serializers.serialize(
      object.evolvesTo,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionChainLink)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionChainLink object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainLinkBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_baby':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isBaby = valueDes;
          break;
        case r'species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary;
          result.species.replace(valueDes);
          break;
        case r'evolution_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonEvolution)]),
          ) as BuiltList<PokemonEvolution>;
          result.evolutionDetails.replace(valueDes);
          break;
        case r'evolves_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionChainLink)]),
          ) as BuiltList<EvolutionChainLink>;
          result.evolvesTo.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionChainLink deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainLinkBuilder();
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


