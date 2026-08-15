//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/gender_detail_pokemon_species_details_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_detail.g.dart';

/// GenderDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [pokemonSpeciesDetails] 
/// * [requiredForEvolution] 
@BuiltValue()
abstract class GenderDetail implements Built<GenderDetail, GenderDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'pokemon_species_details')
  BuiltList<GenderDetailPokemonSpeciesDetailsInner> get pokemonSpeciesDetails;

  @BuiltValueField(wireName: r'required_for_evolution')
  BuiltList<AbilityDetailPokemonInnerPokemon> get requiredForEvolution;

  GenderDetail._();

  factory GenderDetail([void updates(GenderDetailBuilder b)]) = _$GenderDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenderDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenderDetail> get serializer => _$GenderDetailSerializer();
}

class _$GenderDetailSerializer implements PrimitiveSerializer<GenderDetail> {
  @override
  final Iterable<Type> types = const [GenderDetail, _$GenderDetail];

  @override
  final String wireName = r'GenderDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenderDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'pokemon_species_details';
    yield serializers.serialize(
      object.pokemonSpeciesDetails,
      specifiedType: const FullType(BuiltList, [FullType(GenderDetailPokemonSpeciesDetailsInner)]),
    );
    yield r'required_for_evolution';
    yield serializers.serialize(
      object.requiredForEvolution,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GenderDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenderDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'pokemon_species_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(GenderDetailPokemonSpeciesDetailsInner)]),
          ) as BuiltList<GenderDetailPokemonSpeciesDetailsInner>;
          result.pokemonSpeciesDetails.replace(valueDes);
          break;
        case r'required_for_evolution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.requiredForEvolution.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GenderDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenderDetailBuilder();
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

