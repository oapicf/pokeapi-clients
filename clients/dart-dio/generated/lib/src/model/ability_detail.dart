//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_change.dart';
import 'package:openapi/src/model/ability_name.dart';
import 'package:openapi/src/model/ability_flavor_text.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:openapi/src/model/ability_effect_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_detail.g.dart';

/// AbilityDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [isMainSeries] 
/// * [generation] 
/// * [names] 
/// * [effectEntries] 
/// * [effectChanges] 
/// * [flavorTextEntries] 
/// * [pokemon] 
@BuiltValue()
abstract class AbilityDetail implements Built<AbilityDetail, AbilityDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'is_main_series')
  bool? get isMainSeries;

  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  @BuiltValueField(wireName: r'names')
  BuiltList<AbilityName> get names;

  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<AbilityEffectText> get effectEntries;

  @BuiltValueField(wireName: r'effect_changes')
  BuiltList<AbilityChange> get effectChanges;

  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<AbilityFlavorText> get flavorTextEntries;

  @BuiltValueField(wireName: r'pokemon')
  BuiltList<AbilityDetailPokemonInner> get pokemon;

  AbilityDetail._();

  factory AbilityDetail([void updates(AbilityDetailBuilder b)]) = _$AbilityDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityDetail> get serializer => _$AbilityDetailSerializer();
}

class _$AbilityDetailSerializer implements PrimitiveSerializer<AbilityDetail> {
  @override
  final Iterable<Type> types = const [AbilityDetail, _$AbilityDetail];

  @override
  final String wireName = r'AbilityDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityDetail object, {
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
    if (object.isMainSeries != null) {
      yield r'is_main_series';
      yield serializers.serialize(
        object.isMainSeries,
        specifiedType: const FullType(bool),
      );
    }
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(AbilityName)]),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(AbilityEffectText)]),
    );
    yield r'effect_changes';
    yield serializers.serialize(
      object.effectChanges,
      specifiedType: const FullType(BuiltList, [FullType(AbilityChange)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(AbilityFlavorText)]),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AbilityDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityDetailBuilder result,
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
        case r'is_main_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isMainSeries = valueDes;
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityName)]),
          ) as BuiltList<AbilityName>;
          result.names.replace(valueDes);
          break;
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityEffectText)]),
          ) as BuiltList<AbilityEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        case r'effect_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityChange)]),
          ) as BuiltList<AbilityChange>;
          result.effectChanges.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityFlavorText)]),
          ) as BuiltList<AbilityFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInner)]),
          ) as BuiltList<AbilityDetailPokemonInner>;
          result.pokemon.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AbilityDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityDetailBuilder();
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

