//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_summary.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_group_detail.g.dart';

/// VersionGroupDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [order] 
/// * [generation] 
/// * [moveLearnMethods] 
/// * [pokedexes] 
/// * [regions] 
/// * [versions] 
@BuiltValue()
abstract class VersionGroupDetail implements Built<VersionGroupDetail, VersionGroupDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'order')
  int? get order;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  @BuiltValueField(wireName: r'move_learn_methods')
  BuiltList<AbilityDetailPokemonInnerPokemon> get moveLearnMethods;

  @BuiltValueField(wireName: r'pokedexes')
  BuiltList<AbilityDetailPokemonInnerPokemon> get pokedexes;

  @BuiltValueField(wireName: r'regions')
  BuiltList<AbilityDetailPokemonInnerPokemon> get regions;

  @BuiltValueField(wireName: r'versions')
  BuiltList<VersionSummary> get versions;

  VersionGroupDetail._();

  factory VersionGroupDetail([void updates(VersionGroupDetailBuilder b)]) = _$VersionGroupDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionGroupDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionGroupDetail> get serializer => _$VersionGroupDetailSerializer();
}

class _$VersionGroupDetailSerializer implements PrimitiveSerializer<VersionGroupDetail> {
  @override
  final Iterable<Type> types = const [VersionGroupDetail, _$VersionGroupDetail];

  @override
  final String wireName = r'VersionGroupDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionGroupDetail object, {
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
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'move_learn_methods';
    yield serializers.serialize(
      object.moveLearnMethods,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'pokedexes';
    yield serializers.serialize(
      object.pokedexes,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'regions';
    yield serializers.serialize(
      object.regions,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'versions';
    yield serializers.serialize(
      object.versions,
      specifiedType: const FullType(BuiltList, [FullType(VersionSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    VersionGroupDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionGroupDetailBuilder result,
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
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'move_learn_methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.moveLearnMethods.replace(valueDes);
          break;
        case r'pokedexes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.pokedexes.replace(valueDes);
          break;
        case r'regions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.regions.replace(valueDes);
          break;
        case r'versions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(VersionSummary)]),
          ) as BuiltList<VersionSummary>;
          result.versions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VersionGroupDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionGroupDetailBuilder();
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

